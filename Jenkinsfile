// Source - https://stackoverflow.com/a/70926993
// Posted by Franco
// Retrieved 2026-04-05, License - CC BY-SA 4.0

pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'javac BubbleSort.java'
            }
        }
        stage('Run') {
            steps {
                sh 'java BubbleSort'
            }
        }
    }
}
