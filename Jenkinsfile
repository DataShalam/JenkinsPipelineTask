pipeline {
  agent any
  stages {
    stage('Parallel Stages') {
      parallel {
        stage('Run Maven') {
          steps {
            bat 'mvn clean test'
          }
        }

        stage('Maven Version') {
          steps {
            bat 'mvn --version'
          }
        }

      }
    }

  }
}