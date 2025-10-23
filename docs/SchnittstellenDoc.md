# Schnittstelle: fillLevelLogik -> userInterface

| **Methoden**                                        | **Rückgabewert** | **Beschreibung**                                 
| ----------------------------------------------------------- | -----------------|--------------------------------------------- 
| `fillLevelPercent()`                                          | float            | berechneter Füllstand in % (Füllstand wird in fillLevelLogik berechnet)                    
| `crossBoundary()`                                             | bool             | gibt true aus, wenn Warngrenze überschritten                     
| `errorCode()`                                                 | enum             | gibt Fehlerzustand aus ( Beutel korrekt, nicht korrekt, garnicht eingesetzt -> enum Fehlerzustand{NO_BAG, BAG_MISPLACED, OK}
| `UpdateDisplay(fillLevelPercent, crossBoundary, errorCode)` |                  | aktualisiert Anzeige               
| `ShowMessage(text, type)`                                   |                  | zeigt Hinweis für Nutzer an                

# Schnittstelle: hardwareAbstraction -> fillLevelLogik

| **Methoden**         | **Rückgabewert** | **Beschreibung**                                
| -------------------- | -----------------|------------------------------------------------------
| `GetPressure()`      | float            | aktueller Unterdruck (mbar), zur Berechnung des Füllstands                    
| `GetBagStatus()`     | enum             | Status des Beutels (`OK`, `MISSING`, `MISALIGNED`) -> enum Fehlerzustand{NO_BAG, BAG_MISPLACED, OK}                     
| `SensorDataUpdated()`  | Event            | ausgelöst, wenn neue Daten bereitstehen      

# Schnittstelle: fillLevelLogic -> persistence Manager

| **Methoden**                | **Rückgabewert**  | **Beschreibung**                               
| --------------------------- | ------------------|-------------------------------------------------------
| `LoadCalibrationData()`     | struct            | gibt gespeicherte Kalibrierungsparameter zurück       
| `SaveCalibrationData(data)` |                   | speichert neue Kalibrierung (z.B. aktuellen Füllstand, um diesen schon beim einschalten des Geräts anzeigen zu können)        
| `LoadThresholds()`          | struct            | enthält Warn- und Störgrenzen (Warng. bei 90 %, Störg. bei 100 %) 
| `SaveThresholds(data)`      |                   | speichert aktualisierte Werte                                      

# Schnittstellen: hardwareAbstraction -> persistenceManager

| **Methoden**                  | **Rückgabewert** | **Beschreibung**                         
| ----------------------------- | -----------------|----------------------------------- 
| `ReadMemory(address)`         | uint8_t          | liest Byte aus persistentem Speicher (um bereits bestehende Daten aus zu lesen z.B. Füllstand nach letzter Nutzung)
| `WriteMemory(address, value)` |                  | schreibt Byte (um Daten zu Speicher, die nach Abschalten des Geräts nach gebraucht werden z.B. Füllstand nach letzter Nutzung)                                
| `SystemInit()`                |                  | Initialisierung von Sensoren und Display       

# fillLevelLogik
 
| **Methoden**                   | **Rückgabewert** | **Beschreibung**              
| ------------------------------ | -----------------|----------------- 
| `ComputeFillLevel(pressure)`   | float            | berechnet Füllstand in % aus Sensordaten
| `CheckThresholds(fillPercent)` |                  | setzt Warn-/Störstatus (ob Grenze bereitserreicht oder nicht)           
| `DetectError(bagStatus)`       |                  | erkennt Fehler an Beutel   -> setzt Fehlerzustand    
