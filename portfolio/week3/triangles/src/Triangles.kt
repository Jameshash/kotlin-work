import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here
fun isValidTriangle(t : Triangle):Boolean {
    if(t.first + t.second > t.third && t.first + t.third > t.second && t.second +t.third > t.first) {
        return true
    }
    else {
        return false
    }
}
fun triangleArea(t:Triangle):Double{
    if (!isValidTriangle(t)){
        throw IllegalArgumentException("Invalid triangle") 
    }
    
    val a = t.first
    val b = t.second
    val c = t.third
    val s = (a + b + c)/2
    val result = sqrt(s * (s-a) * (s-b) * (s-c))
    return result
}