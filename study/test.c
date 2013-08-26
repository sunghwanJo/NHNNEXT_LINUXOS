#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <stdio.h>

#define LEN 65
char buf[LEN];

int main(){
	int fd = open("open.txt", O_RDONLY);
	
	while(1){
		size_t n = read(fd, buf, LEN-1);
		buf[n] = '\0';
		printf("%s", buf);
		if(n < (LEN-1))
			break;
	}
	return 0;
}
