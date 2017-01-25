# java-sdk

Example to call authenticate service

		final UserAuthenticationApi api = new UserAuthenticationApi();
		ApiClient apiClient = api.getApiClient();
		//Set Authorization key
        apiClient.setAccessToken("");
        api.setApiClient(apiClient);
        User response = api.authenticate(userName, password, clientToken);
        