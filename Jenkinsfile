pipeline {
    agent any

    stages {
        stage('Checkout Code') {
            steps {
                // Checkout the code from Git
                git credentialsId: 'your-git-credentials', url: 'https://github.com/yourusername/yourrepository.git'
            }
        }
        
        stage('Build with Maven') {
            steps {
                // Build the code using Maven
                sh 'mvn clean install'
            }
        }
        
        stage('Import Results') {
            steps {
                // Copy built artifacts to Jenkins workspace
                sh 'cp -r target $WORKSPACE/'
            }
        }
    }
    
    post {
        always {
            // Archive the build artifacts
            archiveArtifacts artifacts: 'target/*.jar', allowEmptyArchive: true
        }
    }
}
