# QN3 AquaSmart Meter

## Five key classes

1. `Customer` - keeps customer details and works with `SmartMeter`.
2. `SmartMeter` - records credit, consumption, and valve status. It works with `WaterToken`.
3. `WaterToken` - represents purchased water credit. It works with `SmartMeter`.
4. `ConsumptionEvent` - stores litres used and cost. It works with `SmartMeter`.
5. `LeakAlert` - flags abnormal continuous flow. It works with `ConsumptionEvent`.

These classes are included as simple Java files in the `src` folder. The main class uses them so the case-study answer is shown in code as well as in writing.

## SmartMeter implementation

The `SmartMeter` class has private fields `meterId`, `creditBalance`, and `valveOpen`. The constructor receives the meter id and opening credit, then opens the valve.

`loadToken(double amount)` adds credit and opens the valve. `recordConsumption(double litres)` charges UGX 50 per litre. If credit is finished, the balance becomes zero and the valve closes.

## JUnit tests

The test class has two tests:

1. Loading a token re-opens a closed valve.
2. Consumption beyond the available credit closes the valve.

## Encapsulation

Encapsulation is used by making the fields private. Other classes cannot directly change the credit balance or valve status. They must use methods like `loadToken()` and `recordConsumption()`. This matters for KIS because billing and disconnection must follow the correct rules instead of being changed carelessly from outside the class.

## NetBeans

Open this folder in NetBeans using `File` > `Open Project`, then run the project or run the tests.
