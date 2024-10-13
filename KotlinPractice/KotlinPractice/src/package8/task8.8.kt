fun fps(minutes: Int, fps: Int): Int {
    val seconds = minutes * 60
    return seconds * fps
}

fun main() {
    val minutes = 5
    val fps = 30
    val totalFrames = fps(minutes, fps)

    println("Количество кадров за $minutes минут при $fps FPS: $totalFrames")
}