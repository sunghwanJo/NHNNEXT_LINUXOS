CC = gcc
CFLAGS = -W -Wall

SRCS = $(wildcard *.c)
OBJS = $(SRCS:.c=.o)

all: main
	@echo "Bulid Successsssss!!"

main: $(OBJS)
	${CC} ${CFLAGS} -o $@ $^

clean:
	rm -rf *.o main
