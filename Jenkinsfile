pipeline{
    agent any
    stages{
        stage('version'){
        steps{
          bat 'mvn -version'  
        }   
      }
       stage('clean'){
        steps{
          bat 'mvn clean'  
        }   
      }
      stage('test'){
        steps{
          bat 'mvn test'  
        }   
      }    
    }   
}
