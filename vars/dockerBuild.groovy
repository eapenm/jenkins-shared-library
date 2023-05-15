def call(String project,String tag, String hubUser){
    sh """
      docker image build -t ${hubUser}/${project} .
      docker image tag ${hubUser}/${project} ${hubUser}/${project}:tag
      docker image tag ${hubUser}/${project} ${hubUser}/${project}:latest
    """
}