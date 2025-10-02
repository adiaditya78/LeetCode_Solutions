// Approach
// Start with all bottles:
// You first drink all the given bottles (numBottles) and mark them as both drunk and empty.

// Exchange process (loop):

// While you still have enough empty bottles to meet the current exchange requirement (empty_bottles >= numExchange):

// Trade them: reduce the empties by numExchange.

// Drink one more new bottle (drunk_bottles++).

// That bottle also becomes empty (empty_bottles++).

// Increase the shopkeeper’s demand (numExchange++).

// Stop condition:
// The loop ends when you no longer have enough empty bottles to meet the rising exchange requirement.

// Return the answer:
// Finally, return the total number of bottles drunk (drunk_bottles).

// Complexity
// Time complexity: O(n)
// Space complexity: O(1)

Water_Bottles_II{
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        if(numBottles < numExchange) return numBottles;
        int drunk_bottles = numBottles;
        int empty_bottles = numBottles;
        while(empty_bottles >= numExchange){
            empty_bottles -= numExchange;
            drunk_bottles++;
            empty_bottles++;
            numExchange++;
        }
        return drunk_bottles;
    }
}
