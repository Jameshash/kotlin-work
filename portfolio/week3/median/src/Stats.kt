fun median(numbers:List<Double>): Double {
    if (numbers.isEmpty()){
        throw IllegalArgumentException("Invalid input")
    }
    val sorrtedNumbers = numbers.sorted()
    val n = sorrtedNumbers.size
    if(n % 2 == 0){
        val leftmiddle = n/2-1
        val rightmiddle = n/2
        val leftvalue = sorrtedNumbers[leftmiddle]
        val rightvalue = sorrtedNumbers[rightmiddle]
        val median = (leftvalue + rightvalue)/2.0
        return median
    }else{
        val middle = n/2
        return sorrtedNumbers[middle]
    }
}