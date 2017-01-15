package by.it.senchenko.project.java.beans;


public class Periodicals {

    private int ID;
    private String Name;
    private String Author;
    private String Date;
    private int FK_User;

    public Periodicals() {
    }

    public Periodicals(int ID, String name, String autor, String date, int FK_User) {
        this.ID = ID;
        Name = name;
        Author = autor;
        Date = date;
        this.FK_User = FK_User;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String autor) {
        Author = autor;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public int getFK_User() {
        return FK_User;
    }

    public void setFK_User(int FK_User) {
        this.FK_User = FK_User;
    }

    @Override
    public String toString() {
        return "Periodicals{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", Autor='" + Author + '\'' +
                ", Date='" + Date + '\'' +
                ", FK_User=" + FK_User +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Periodicals periodicals = (Periodicals) o;

        if (ID != periodicals.ID) return false;
        if (FK_User != periodicals.FK_User) return false;
        if (Name != null ? !Name.equals(periodicals.Name) : periodicals.Name != null) return false;
        if (Author != null ? !Author.equals(periodicals.Author) : periodicals.Author != null) return false;
        return Date != null ? Date.equals(periodicals.Date) : periodicals.Date == null;

    }

    @Override
    public int hashCode() {
        int result = ID;
        result = 31 * result + (Name != null ? Name.hashCode() : 0);
        result = 31 * result + (Author != null ? Author.hashCode() : 0);
        result = 31 * result + (Date != null ? Date.hashCode() : 0);
        result = 31 * result + FK_User;
        return result;
    }
}
