package org.jellyfin.apiclient.interaction;

import org.jellyfin.apiclient.model.apiclient.*;

public class ConnectionResult
{
    private ConnectionState State;
    public final ConnectionState getState()
    {
        return State;
    }
    public final void setState(ConnectionState value)
    {
        State = value;
    }
    private java.util.ArrayList<ServerInfo> Servers;
    public final java.util.ArrayList<ServerInfo> getServers()
    {
        return Servers;
    }
    public final void setServers(java.util.ArrayList<ServerInfo> value)
    {
        Servers = value;
    }
    private ApiClient ApiClient;
    public final ApiClient getApiClient()
    {
        return ApiClient;
    }
    public final void setApiClient(ApiClient value)
    {
        ApiClient = value;
    }

    public ConnectionResult()
    {
        setState(ConnectionState.Unavailable);
        setServers(new java.util.ArrayList<ServerInfo>());
    }
}
