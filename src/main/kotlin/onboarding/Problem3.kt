package onboarding

/**
 * 기능 요구 사항
 * 1. 3,6,9의 숫자에 따라 박수를 세는 메소드 -> 33의 경우 3,3으로 2번 박수
 */
fun solution3(number: Int): Int {
    TODO("프로그램 구현")
}

private fun countClap(number: String): Int {
    // 3, 6, 9 숫자에 따라 count
    return number.count { (it - '0') == 3 || (it - '0') == 6 || (it - '0') == 9 }
}