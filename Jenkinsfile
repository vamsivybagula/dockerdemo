pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building application...'
                // Example: sh './gradlew build' or 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                echo 'Running tests...'
                // Example: sh './gradlew test'
            }
        }
    }

    post {
        success {
            echo 'The build was successful!'
            // Add actions here, such as:
            // slackSend channel: '#deploy-alerts', message: "Build ${env.BUILD_NUMBER} passed."
            // archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
        }
        failure {
            echo 'The build failed.'
        }
        always {
            echo 'Cleaning up workspace...'
        }
    }
}
