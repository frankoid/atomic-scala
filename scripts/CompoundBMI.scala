val lbs = 150.0
val height = 68.0
val idealWeight:Double = {
  val bmi = lbs / (height * height) * 703.07
  //if (bmi < 18.5) "underweight"
  //else if (bmi < 25) "normal"
  //else "overweight"
  var idealWeight = 22 * (height * height) / 703.07
  idealWeight
}
println(idealWeight)
