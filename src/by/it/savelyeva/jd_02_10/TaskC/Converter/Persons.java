package by.it.savelyeva.jd_02_10.TaskC.Converter;

/**
 * Created by nato on 10/22/16.
 */

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement
public class Persons {
    @XmlElement(name="Person")
    private ArrayList<by.it.savelyeva.jd_02_10.TaskC.Converter.Person> list = new ArrayList<>();
    public Persons() {
        super();
    }
    public void setList(ArrayList<by.it.savelyeva.jd_02_10.TaskC.Converter.Person> list) {
        this.list = list;
    }
    public boolean add(by.it.savelyeva.jd_02_10.TaskC.Converter.Person person) {
        return list.add(person);
    }
    @Override
    public String toString() {
        return "Persons [list=\n" + list + "\n]";
    }
}
