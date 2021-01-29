package entities;

import entities.Rezerwacja;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-01-29T09:22:23")
@StaticMetamodel(Wydarzenie.class)
public class Wydarzenie_ { 

    public static volatile SingularAttribute<Wydarzenie, String> typWydarzenia;
    public static volatile CollectionAttribute<Wydarzenie, Rezerwacja> rezerwacjaCollection;
    public static volatile SingularAttribute<Wydarzenie, Integer> czasTrwania;
    public static volatile SingularAttribute<Wydarzenie, String> nazwaWydarzenia;
    public static volatile SingularAttribute<Wydarzenie, Integer> wydarzenieId;
    public static volatile SingularAttribute<Wydarzenie, String> godzinaRozpoczecia;
    public static volatile SingularAttribute<Wydarzenie, Integer> liczbaMiejsc;
    public static volatile SingularAttribute<Wydarzenie, String> miejsceWydarzenia;
    public static volatile SingularAttribute<Wydarzenie, String> dataWydarzenia;
    public static volatile SingularAttribute<Wydarzenie, String> linkDoWydarzenia;

}