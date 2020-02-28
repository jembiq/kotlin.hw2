import Verdicts

@Suppress("IMPLICIT_CAST_TO_ANY")
fun main() {
    val mass   = 100f;
    val height = 1.80f;
    val index = bodyMassIndex(mass, height);

    val verdict = when(index){
        in Float.MIN_VALUE ..    16f          -> Verdicts.VERY_LOW_WEIGHT
        in             16f ..  18.5f          ->      Verdicts.LOW_WEIGHT
        in           18.5f .. 24.99f          ->   Verdicts.NORMAL_WEIGHT
        in             25f ..    30f          ->      Verdicts.OVERWEIGHT
        in             30f ..    35f          ->             Verdicts.FAT
        in             35f ..    40f          ->        Verdicts.VERY_FAT
        in             40f .. Float.MAX_VALUE ->  Verdicts.SUPER_VERY_FAT
        else -> "bruh"
    }

    print("$index, $verdict")
}

private fun bodyMassIndex(
    mass   : Float,
    height : Float
) : Float = mass / (height*height)
