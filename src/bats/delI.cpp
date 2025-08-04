#include <iostream>
using namespace std;
int main(int argc, char *argv[]) {
    if(argc != 2) {
        cout << "Wrong arguments: run_file_name image_hash_for_remove\n";
        return 0;
    }

    string cmd = "docker rmi -f ";
    cmd.append(argv[1]);
    system(cmd.c_str());
}