# cycles_sandbox
This is the results of testing what is causing cycles with the domain model.

Results found:
-	Separate packages for each type of file is not necessary to reduce cycles (entities, repo, public objects, etc)
-	A separate package for external access is necessary
- The API* and public objects need to be in a separate package from the domain
  - Any other domain which needs to communicate with this domain should only access the external package
-	*The API can stay in the domain package, but an interface for it should be publicly accessible from the external package
	- This interface is what we should import in other domains that need access to the functionality
	- This will also make mocking easier for unit tests
