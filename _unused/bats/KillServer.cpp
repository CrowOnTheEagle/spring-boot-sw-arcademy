#include <cstdio>
#include <iostream>
#include <fstream>
int main() {
    system("netstat -ano | find \"LISTEN\" | find \":8081\" > result.txt");
    std::ifstream result("result.txt");
    std::string type, localAddr, foreginAddr, state;
    int pid = -1;
    result >> type >> localAddr >> foreginAddr >> state >> pid;
    if(pid > 0) {
        std::string com("taskkill /f /pid ");
        com += std::to_string(pid);
        system(com.c_str());
    }
    result.close();
    if(std::remove("result.txt")) {
        std::cout << "Remove result file fail\n";
    }
}