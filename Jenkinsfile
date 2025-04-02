pipeline{
    agent any
        tools{
            jdk 'JDK17'
            maven 'Maven'
        }
        stages{
            stage('Build Maven'){
                steps{
                    checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/SreeAdvaitha758/jenkinsDemo']])
                    bat 'mvn clean install'
                }
            }
           
        }
}