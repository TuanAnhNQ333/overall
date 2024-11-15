// cho 1 chuoi khoi tao, tong 2 bien trong mang bang target, tra ve gia tri thu tu cua 2 so do
#include<stdio.h>
#include<stdlib.h>
void check(int sums[], int target) {
    for(int i = 0; i < 4; i ++) {
        for(int j = 0; j < 4; j ++) {
            if(i < j) 
                if(sums[i] + sums[j] == target) {
                printf("%d %d\n", i, j);
            }
        }
    }
}
int main() {
    int sums[] = {2,7,11,15};
    int target = 9;
    check(sums,target);
    return 0;
}