# Tracability Matrix

| Requirement-ID | Komponente                         | Klasse(n)                                          | Schnittstelle(n)                                            | Testfall    
|----------------|------------------------------------|----------------------------------------------------|-------------------------------------------------------------|----------------
| 1.1            | hardwareAbstraction                |                                                    | GetPressure()
| 1.2            | fillLevelLogik                     |                                                    | fillLevelPercent()
| 1.3            | userInterface                      |                                                    | UpdateDisplay(fillLevelPercent, crossBoundary, errorCode)
| 2.1            | userInterface                      |                                                    | UpdateDisplay(fillLevelPercent, crossBoundary, errorCode), SensorDataUpdated()
| 2.2            | userInterface                      |                                                    | UpdateDisplay(fillLevelPercent, crossBoundary, errorCode)
| 2.3            | persistanceManager                 |                                                    | SaveCalibrationData(data), SaveThresholds(data), WriteMemory(address, value)
| 2.4            | userInterface                      |                                                    | UpdateDisplay(fillLevelPercent, crossBoundary, errorCode)
| 2.5            | userInterface                      |                                                    | UpdateDisplay(fillLevelPercent, crossBoundary, errorCode)
| 2.6            | userInterface                      |                                                    | UpdateDisplay(fillLevelPercent, crossBoundary, errorCode)
| 2.7            | userInterface                      |                                                    | UpdateDisplay(fillLevelPercent, crossBoundary, errorCode)
| 2.8            | fillLevelLogik                     |                                                    | SensorDataUpdated()
| 2.9            | userInterface                      |                                                    | 
| 3.1            | fillLevelLogik                     |                                                    | LoadThresholds()
| 3.2            | fillLevelLogik                     |                                                    | LoadThresholds()
| 3.3            | fillLevelLogik, hardwareAbstraction|                                                    | ComputeFillLevel(pressure), GetPressure()
| 3.4            | hardwareAbstraction                |                                                    | 
| 4.1            | userInterface                      |                                                    | ShowMessage(text, type)
| 4.2            | userInterface                      |                                                    | ShowMessage(text, type)
| 4.3            | userInterface                      |                                                    | ShowMessage(text, type)
| 5.1            | fillLevelLogik, hardwareAbstraction|                                                    | errorCode(), GetBagStatus(), GetPressure()
| 5.2            | userInterface                      |                                                    | ShowMessage(text, type)
| 5.3            | userInterface                      |                                                    | ShowMessage(text, type)
| 6.1            | userInterface, fillLevelLogik, hardwareAbstraction     |                                | ShowMessage(text, type), GetPressure(), stopUsage(), startUsage()
| 6.2            | userInterface, fillLevelLogik, hardwareabstraction     |                                | ShowMessage(text, type), GetBagStatus(), stopUsage(),startUsage()
| 7.1            | hardwareAbstraction                |                                                    | 
