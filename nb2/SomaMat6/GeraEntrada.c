#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(int argc, char** argv)
{
    int n = atoi(argv[1]), m = atoi(argv[2]), i, j;

    printf("%d %d\n", n, m);
    srand(time(NULL));
    for(i=0; i<n; i++)
    {
        for(j=0; j<m; j++)
        {
            printf("%d%c", rand()%1001, (j<m-1?' ':'\n'));
        }
    }
    return 0;
}