fun main() {
    val speedKmPerHour = 20.0 // Speed in km/h

    // Distances for each route in kilometers
    val route1DistanceKm = 5000.0
    val route2DistanceKm = 25000.0
    val route3DistanceKm = 50000.0
    val anotherRouteDistanceKm = 10000.0

    // Function to calculate time in hours
    fun calculateTime(distanceKm: Double): Double {
        return distanceKm / speedKmPerHour
    }

    println("Using if statement:")
    println("Time taken for Route 1: ${calculateTime(route1DistanceKm)} hours")
    println("Time taken for Route 2: ${calculateTime(route2DistanceKm)} hours")
    println("Time taken for Route 3: ${calculateTime(route3DistanceKm)} hours")
    println("Time taken for Another Route: ${calculateTime(anotherRouteDistanceKm)} hours")
}
