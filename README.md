# GitCheckoutSharedLibrary
First Shared Library for Git Checkout
To Use this Shared Library do the following steps in Jenkins

Step 1: Go to Manage Jenkins –> Configure System

Step 2: Find the Global Pipeline Libraries section and add your repositories details and configurations.
        
        Name: As per your choice (For example gitcheckout-library)
        Default version: As per your choice (For example master)
        
        Allow default version to be overridden checkmark
        include @Library changes in job recent changes checkmark
        
        Retrieval method 
        Select Modern SCM
        
        Source Code Management
        Select Git
        Project Repositories https://github.com/faisal-ops/GitCheckoutSharedLibrary.git

To test this library use the TestPipeline	from the same repo.
