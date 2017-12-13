# SFDX  App
This is an example Salesforce Lightning application that was built pre-DX.
The application has been migrated to DX.

## Dev, Build and Test
Athenticate with DX:
```sfdx force:auth:web:login -d -a devhuborg```

Push to a DX env:
```sfdx force:source:push```

Run tests:
```sfdx force:apex:test:run```


