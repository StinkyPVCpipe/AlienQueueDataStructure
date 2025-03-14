public class AlienQueue {
    private Alien front;
    private Alien rear;
    private int size;

    public AlienQueue()
    {
        front = null;
        rear = null;
    }

    public void addAlienToEnd(String name)
    {
        if(front == null)
        {
            Alien al = new Alien(name, front);
            front = al;
            rear = al;
        }
        else
        {
            Alien al = new Alien(name, null); //the new alien is created to enter the queue
            rear.setLink(al);//previous 'rear' gets linked to the new alien
            rear = al; //rear gets new alien

        }
    }

    public void removeAlienFromStart()
    {
    front = front.getLink();
    }

    public void printAlienQueue()
    {
        Alien position = front;
        if (front == null)
        {
            System.out.println("no venusians are in line");
        }
        while (position != null) {
            System.out.println(position.getName());
            position = position.getLink();
        }
    }

    public int amntOfAliens()
    {
        if(front == null)
        {
          return 0;
        }
        int count = 0;
        Alien position = front;
        while (position != null)
        {
            count++;
            position = position.getLink();
        }
        return count;
    }

    public void boardAllAliens(AlienQueue AQ)
    {
        while(front != null)
        {
            System.out.println(front.getName() + " successfully boarded the saucer!" +
                    "\nhere's who's left");
            AQ.removeAlienFromStart();
            AQ.printAlienQueue();
        }
        System.out.println("Congratulations on a successful mission :D!");
    }

    public String getFront()
    {
        return front.getName();
    }

    public String getRear()
    {
        return rear.getName();
    }

    private class Alien
    {
        private String name;
        private Alien link;
       // private

        public Alien(String name, Alien link)
        {
            this.name = name;
            this.link = link;
        }

        public String getName()
        {
            return name;
        }
        public Alien getLink()
        {
            return link;
        }
        public void setLink(Alien newLink)
        {
            link = newLink;
        }


    }

}
