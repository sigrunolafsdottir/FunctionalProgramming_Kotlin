package AoC.Dag7

/*
Lösningsskiss

Gör en klass (i Kotlin, välj Data class), Bag, som innehåller en färg (String) och ett antal (så många väskor av en viss
färg som en annan väska av en viss färg kan innehålla) och en boolean found som från början är false

Läs in input och skapa en Map (bags) där varje Bag är nyckel
Värdet är en lista av alla Bags som den första nyckelbag:en kan innehålla

Läs igenom Mapen och lista upp alla nycklar som har en golden Bag i sin värdelista

Skapa en rekursiv funktion fidBags som initialt tar en lista innehållande en instans av "golden bag"  (bag)
och en(från början tom) lista, (res)

För varje Bag i bags, kolla vilka nycklar som har denna som värde,
lägg till nycklarna i res (rensa från tidigare anrops nycklar) och i bags, anropa funktionen igen och igen
tills alla nycklar som kan innehålla en golden bag har hittats och lagts i res

FÖr att slippa oändliga loopar: i findbag, så fort en bag har "hittats", (dvs. vi ser att den kan innehålla en
golden bag), sätt dess found till true.

När sökningen görs efter nycklar som kan innhålla gyllene väskor filtrerar man på om de tidigare har
blivit "found" eller inte

Sen får man be en bön om att det inte är så mycket input-data att man råkar ut för Stackoverflow,
men förhoppningsvis kommer allt att gå bra!

Bättre prestanda (men ev. lite jobbigare att bygga mappen) kommer det att bli om man från början bygger
sin map så att varje nyckel är en bag och värdet är en lista av alla bags som kan innehålla nyckeln
(istället för tvärt om)

Den rekursiva funktionen måste i så fall ändras så att sökningen sker från nyckel till värde och inte tvärt om.

Detta med hur många väskor andra väskor kan innhålla används ju inte i uppg a, men jag sätter mina
guldpengar på att dessa siffror kommer att figurera i uppg b
 */