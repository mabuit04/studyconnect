## BDD-Test mit Cucumber  
Zum Testen der Gherkin Syntax wird Cucumber verwendet: https://cucumber.io/  
Die Dependencies müssen entsprechend der Dokumentation in der pom.xml hinzugefügt werden.  
Die Gherkin Syntax wird in der Datei '/studyconnect/backend/src/test/resources/features/Task.feature' hinterlegt. Unter "Background" kann eine Vorbedingung, die für alle Szenarien gleich gilt, festgelegt werden. In unserem Beispiel sollte der User auf den sich die Szenarios beziehen eingeloggt sein.  
  
"Given" signalisiert dann die Bedingung für das konkrete Szenario bspw. muss für das Bearbeiten einer Aufgabe die Vorbedingung erfüllt sein, dass überhaupt eine Aufgabe vorhanden ist.  
"When" ist das Schlüsselwort für die Aktion des Benutzers also bspw. klickt der Benutzer auf "neue Aufgabe erstellen"  
"Then" beschreibt, was darauf im Idealfall passieren soll. Also die Aufgabe wird angelegt oder die Exportfunktion wird aufgerufen.  

## TaskSteps.java  
Abgelegt unter  
'backend/src/test/java/de/studyconnect/backend/steps/TaskSteps.java'
setzt die Gherkin Syntax in Programmbefehle um. Dazu wird jedem Prosatext aus der Task.feature ein Programmschnipsel zugeordnet, welcher genau das ausführt, was im Text beschrieben wird. Dazu werden die Annotation @Given, @When usw. verwendet, damit Cucumber den entsprechenden Programmcode ausführen kann beim Ablauf der Tests.

