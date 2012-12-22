/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package eulerscala

object Problem3 {
  var primes:Array[Long] = Array[Long]()
  var largestPrime = 1l
  var MAX = 600851475143l
  def main(args: Array[String]) {
    var i = 2l
    while (i <= MAX) {
      if (isPrime(i) && MAX%i == 0l) {
        largestPrime = i
        while (MAX%largestPrime == 0l && largestPrime > 1l) {
          MAX = MAX / largestPrime
        }
      }
      i += 1l
    }
    println(largestPrime)
  }
  def isPrime(num:Long): Boolean = {
    for (i <- primes) {
      if (num % i == 0l) {
        return false
      }
    }
    primes = primes:+num
    return true
  }
  
}
