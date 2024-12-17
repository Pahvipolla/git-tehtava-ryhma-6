Koska projekti sai olla mitä tahansa, niin tässäpä sitten projektina klassinen hello world... hieman tuunattuna, mutta edelleen yhtälailla turhake ohjelmaksi.

Ohjelma lataa greetings.json tiedoston annetusta URL:sta ja käyttää sitten json-simple kirjastoa json tiedon lukemiseen. Kaivaa tiedostosta eri kielivaihtoehdot ja antaa käyttäjän valita millä kielellä tulee hello world.

Jos olet GIT_harjoitus kansiossa, niin kääntäminen ja ajaminen:

Kääntäminen
 javac -cp ".;lib/json-simple-1.1.1.jar" src/App.java

Ajaminen:
java -cp ".;lib/json-simple-1.1.1.jar;src"

Jos menet ja sotket kansiopolkuja, jne, niin korjaa kääntämisen ja ajamisen käskyt vastaavasti.

greetings.json tiedoston voit jemmata mille tahansa web-sivustolle. Tässä esimerkissä käytetään osoitetta: https://aivopieru.net/greetings.json

Ja ei muuta ku räveltämään.