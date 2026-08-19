pipeline {
  agent any
  stages {
    stage('compile') {
      steps{
        sh 'javac StaticDemo.java'
      }
    }
    stage('Run') {
      steps{
        sh 'java StaticDemo'
      }
    }
  }
}
