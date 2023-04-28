#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

int solution(int N, int K) {
    string str = to_string(N);
    int n = str.length();

    for (int i = 0; i < n && K > 0; i++) {
        int max_digit = str[i];
        int max_index = i;

        // find the maximum digit among the remaining digits
        for (int j = i + 1; j < n && j - i <= K; j++) {
            if (str[j] > max_digit) {
                max_digit = str[j];
                max_index = j;
            }
        }

        // if the maximum digit is greater than the current digit, swap them
        if (max_digit > str[i]) {
            swap(str[i], str[max_index]);
            K -= max_index - i;
        }
    }

    return stoi(str);
}

