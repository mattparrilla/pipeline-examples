pipeline {
  agent any
  stages {
    stage("Hello") {
      steps {
        echo "Hello"
      }
    }
    stage("Evaluate FOO") {
      when {
        environment name: "CHANGE_TARGET", value: "apple"
      }
      steps {
        echo "World"
      }
    }
  }
}
