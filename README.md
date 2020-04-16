
# Calculator
Die .fxml Datei des Taschenrechners wurde mit Hilfe von Scenebuilder erzeugt. Innerhalb der Kontroller Datei gibt es fünf Methoden, auf welche im folgenden eingegangen wird.

## handleButtonAction
Der Methode "handleButtonAction" wird ein ActionEvent übergeben. Dieses beinhaltet die Button 0-9 und punkt. Innerhalb der Methode "handleButtonAction" wird überprüft, welcher Button betätigt wurde. Danach wird der jeweilige Inhalt in der Textausgabe angezeigt.

## handleButtonActionCommand
der Methode "handleButtonActionCommand" wird einer von vier möglichen Operator-Buttons übergeben. Diese sind:

* Plus
* Minus
* Mal
* Geteilt
Innerhalb der Methode"handleButtonActionCommand" wird zuerst dem Double-array "numbers" die zuvor eingetippte Zahl hinzugefügt.Danach wird überprüft welcher Button gedrückt wurde. Je nachdem wird dem Integer-array "operators" eine 1, 2, 3 oder 4 hinzugefügt. Zum Schluss wird die Textausgabe geleert.

## handleButtonActinClear
Sobald die Taste C gedrückt wird, werden numbers, operators und result auf default gesetzt und das Anzeigefenster geleert.

## handleButtonActionCommandExtend
Bei dieser Methode wird die letzte Eingabe in einem Double Attribut gespeichert. Danacht wird unterschieden ob der prozent-Button, Wurzel-Button oder der PlusMinus-Button gedrückt wurde. Falls der Prozent-Button getriggerd wurde, wird die Zahl im Anzeigefenster durch 100 dividiert und erneut ausgegeben. Beim Wurzel-Button passiert dasselbe, allerdings wird hierbei die WUrzel gezogen. Während beim PlusMinus-Button das Vorzeichen geändert wird.
## handleButtonActionEqual
In dieser Methode wird die eigentliche Rechenoperation ausgeführt. Sobald der equal-Button gedrückt wurde, wird die letzte Eingabe "numbers" hinzugefügt. Danach wird das Attribut Result, auf den ersten hinterlegten Wert im numbers-array gesetzt. Nun wird eine For-Schleife Initialisiert. Diese läuft solange bis der Wert i genauso groß ist, wie die länge des arrays numbers. Innerhalbt der For-Schleife wurde ein If-Konstrukt erzeugt, welches der Reihe nach den Wert des operators-array überprüft. Je nach hinterlegtem Wert wird die daruaffolgende Zahl des numbers-array auf result addiert, subtrahiert, multipliziert oder dividiert. Falls beim teilen durch Null dividiert werden sollte wird die Exception geworfen "divison by zero". Danach wird result im Textfeld ausgegeben. Zum Schluss wird numbers, operators und result auf default gesetzt.
