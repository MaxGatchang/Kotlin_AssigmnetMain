fun main() {

    //A car is moving at a speed of 1000m/s at an acceleration of 25m/s/s
    //     Find the time it will take to move a distance of 5km
    //    Hint - acceleration = speed/time
    //           speed = distance/time

    //Below is the output of the above question
    val speed = 1000.0 // m/s
    val acceleration = 25.0 // m/s^2
    val distanceKm = 5.0 // km

    // Convert distance from kilometers to meters
    val distanceMeters = distanceKm * 1000

    // Calculate time using the formula: time = distance / speed
    val time = distanceMeters / speed

    println("Time taken to move a distance of $distanceKm km is $time seconds.")
}
