//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.27 at 12:26:46 PM MSK 
//


package by.it.rudzko.jd03_02.POJO;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import java.util.List;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the by.it.rudzko.pojo package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MyDataBase_QNAME = new QName("http://POJO.jd03_02.rudzko.it.by/", "myDataBase");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: by.it.rudzko.pojo
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MyDataBase }
     */
    MyDataBase createMyDataBase(Users us, Roles roles, Periodicals p, Readership aud, Subscription sub) {
        MyDataBase result = new MyDataBase();
        result.setUsers(us);
        result.setRoles(roles);
        result.setPeriodicals(p);
        result.setReadership(aud);
        result.setSubscription(sub);
        return result;
    }

    /**
     * Create an instance of {@link User }
     */
    public User createUser(String name, Role role, int birthYear, String sex) {
        User user = new User();
        user.setName(name);
        user.setRole(role);
        user.setBirthYear(birthYear);
        user.setSex(sex);
        return user;
    }

    /**
     * Create an instance of {@link Readership }
     */
    Readership createReadership(List<Audience> audience) {
        Readership res = new Readership();
        res.setAudience(audience);
        return res;
    }

    /**
     * Create an instance of {@link Subscr }
     */
    public Subscr createSubscr(User user, Periodical periodical) {
        Subscr result = new Subscr();
        result.setSubscriber(user);
        result.setPeriodical(periodical);
        return result;
    }

    /**
     * Create an instance of {@link Audience }
     */
    public Audience createAudience(String group) {
        Audience aud = new Audience();
        aud.setGroup(group);
        return aud;
    }

    /**
     * Create an instance of {@link Periodical }
     */
    public Periodical createPeriodical(String title, int subIndex, Audience aud, User addedBy) {
        Periodical p = new Periodical();
        p.setTitle(title);
        p.setSubIndex(subIndex);
        p.setAudience(aud);
        p.setAddedBy(addedBy);
        return p;
    }

    /**
     * Create an instance of {@link Roles }
     */
    Roles createRoles(List<Role> role) {
        Roles r = new Roles();
        r.setRoles(role);
        return r;
    }

    /**
     * Create an instance of {@link Users }
     */
    Users createUsers(List<User> user) {
        Users u = new Users();
        u.setUsers(user);
        return u;
    }

    /**
     * Create an instance of {@link Role }
     */
    public Role createRole(String participant) {
        Role r = new Role();
        r.setParticipant(participant);
        return r;
    }

    /**
     * Create an instance of {@link Periodicals }
     */
    Periodicals createPeriodicals(List<Periodical> periodical) {
        Periodicals p = new Periodicals();
        p.setPeriodicals(periodical);
        return p;
    }

    /**
     * Create an instance of {@link Subscription }
     */
    Subscription createSubscription(List<Subscr> subscr) {
        Subscription sub = new Subscription();
        sub.setSubscr(subscr);
        return sub;
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MyDataBase }{@code >}}
     */
    @XmlElementDecl(namespace = "http://POJO.jd03_02.rudzko.it.by/", name = "myDataBase")
    public JAXBElement<MyDataBase> createMyDataBase(MyDataBase value) {
        return new JAXBElement<>(_MyDataBase_QNAME, MyDataBase.class, null, value);
    }

}
