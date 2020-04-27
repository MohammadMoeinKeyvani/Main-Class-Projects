public class Lesson {
    private String lessonName;

    ////////////////////////////////// constructors
    public Lesson() {}

    ////////////////////////////////// setters
    public void setLessonName (String ln)
    {
        this.lessonName = ln;
    }

    ////////////////////////////////// getters
    public String getLessonName ()
    {
        return this.lessonName;
    }

    /////////////////////////////////// methods
    public int numberOfUnit ()
    {
        if (this.lessonName.equals("advanced programming"))
            return 3;
        else if (this.lessonName.equals("mathmatics 2"))
            return 3;
        else if (this.lessonName.equals("physics 2"))
            return 2;
        else
            return 0;
    }

    public String pishNiaz ()
    {
        if (this.lessonName.equals("advanced programming"))
            return "Programming Basics";
        else if (this.lessonName.equals("mathmatics 2"))
            return "Mathmatics 1";
        else if (this.lessonName.equals("physics 2"))
            return "Physics 1";
        else
            return "Can't find anything";
    }

    public String hamNiaz ()
    {
        if (this.lessonName.equals("advanced programming"))
            return "Advanced Programming Workshop";
        else if (this.lessonName.equals("mathmatics 2"))
            return "Nothing";
        else if (this.lessonName.equals("physics 2"))
            return "Nothing";
        else
            return "Can't find anything";
    }

}
