def call(Map stageParams) {

    checkout([
        $class: 'GitSCM',
        branches: [[name:  stageParams.branch_name ]],
        userRemoteConfigs: [[ url: stageParams.url_name ]]
    ])
}
