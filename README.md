# Multi-Threading
## Esercizio1
Esercizio Multi-Threading
Nel progetto sul Multi-Threading sono presenti Main e 2 classi :Hi,Hello.
Ogni classe ha 2 metodi: metodo Run e metodo Try-Catch,che fanno partire i 2 Thread (hi ed hello),ed all'interno 
del Try-Catch oltre a "InterruptedException ex" c'è anche il metodo Thread.sleep(1000) che permette di avere delle pause
di pochi milli secondi tra una stampa e l'altra, quindi permette anche di avere le due stampe di Hi ed Hello alternate 
di uno o più. 
Nel main vengono istanziati gli oggetti delle rispettive classi per permettere al progetto di stampare l'output.
Il programma da i seguenti risultati:
```
run:
Oggetto Hello istanziato
Hi
Hello
Hi
Hello
Hello
Hi
Hi
Hello
Hi
Hello
Hi
Hello
Hi
Hello
Hi
Hello
Hi
Hello
Hi
Hello
BUILD SUCCESSFUL (total time: 10 seconds)
```
```
run:
Oggetto Hello istanziato
Hi
Hello
Hi
Hello
Hi
Hello
Hello
Hi
Hello
Hi
Hi
Hello
Hi
Hello
Hi
Hello
Hi
Hello
Hello
Hi
BUILD SUCCESSFUL (total time: 10 seconds)
```
```
run:
Oggetto Hello istanziato
Hi
Hello
Hello
Hi
Hi
Hello
Hello
Hi
Hello
Hi
Hi
Hello
Hi
Hello
Hi
Hello
Hi
Hello
Hi
Hello
BUILD SUCCESSFUL (total time: 10 seconds)
```
## Esercizio2
Documentazione Esercizio Say

In questo esercizio,al contrario di quello precedente si usa una sola
classe per avviare 2 Thread, e si instanziano 2 oggetti (p.1 e p.2) che stampano , con il metodo Run() x 10 volte, rispettivamente le 
parole "Hi" ed "Hello" non seguendo un ordine per preciso, e li avviano con il metodo Start().

il risultato è il seguente: 
```
Run1 :
Hi
Hi
Hi
Hi
Hi
Hi
Hi
Hi
Hi
Hi
Hello
Hello
Hello
Hello
Hello
Hello
Hello
Hello
Hello
Hello
BUILD SUCCESSFUL (total time: 0 seconds)
```
```
Run2: 
Hi
Hi
Hi
Hi
Hi
Hello
Hello
Hello
Hello
Hello
Hello
Hello
Hello
Hello
Hello
Hi
Hi
Hi
Hi
Hi
BUILD SUCCESSFUL (total time: 0 seconds)
```
```
Run3:
Hi
Hi
Hi
Hi
Hi
Hi
Hi
Hi
Hello
Hello
Hello
Hello
Hello
Hello
Hello
Hello
Hello
Hello
Hi
Hi
BUILD SUCCESSFUL (total time: 0 seconds)
```
