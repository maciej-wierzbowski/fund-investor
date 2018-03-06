# Fund Investor
Aplikacja do wyliczania kwot dla funduszy inwestycyjnych.

#### Założenia
Fundusz składa się z:
- ID
    - Nazwy
    - Rodzaju
- Mamy 3 rodzaje funduszy:
    - Polskie
    - Zagraniczne
    - Pieniężne
- Mamy 3 style inwestowania:
    - bezpieczny - 20% Polskie, 75% Zagraniczne, 5% Pieniężne
    - zrównoważony - 30% Polskie, 60% Zagraniczne, 10% Pieniężne
    - agresywny - 40% Polskie, 20% Zagraniczne, 40% Pieniężne

#### Kompilacja
```sh
javac src\pl\mw\fundinvestor\*.java
```
#### Uruchomienie
```sh
java -cp src pl.mw.fundinvestor.Main
```

#### IntelliJ
1. Open Project.
2.  Select folder 'fund-investor'.
3. Click Import Changes.
4. Menu Build -> Build project.

- Run application:
5. Select 'Inwestycje' configuration.
6. Menu Run -> Run 'Inwestycje'.
- Run tests:
7. Select 'Test' configuration.
8. Menu Run -> Run 'Test'.
