pipeline {
  agent any
  stages {
    stage('Parallel Stages') {
      parallel {
        stage('Run Maven') {
          steps {
            sh 'mvn test'
          }
        }

        stage('Maven Version') {
          steps {
            sh 'mvn --version'
          }
        }

      }
    }

  }
}