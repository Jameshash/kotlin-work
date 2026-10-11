// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string
  fun redact (text: String, target: String, symbol: Char = 'X'): String{
    if (target.isEmpty()){
        return text
    }
    val replacement = symbol.toString().repeat(target.length)
    return text.replace(target, replacement)
  }