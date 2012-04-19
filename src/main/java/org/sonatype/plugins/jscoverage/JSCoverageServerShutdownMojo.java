package org.sonatype.plugins.jscoverage;

import org.codehaus.plexus.util.cli.Commandline;

/**
 * @goal stop-jscoverage
 * @phase post-integration-test
 */
public class JSCoverageServerShutdownMojo
        extends AbstractJSCoverageMojo
{
    /**
     * Stop server on the port given by PORT.
     *
     * @parameter default-value="8080" expression="${jscoverage.port}"
     */
    private int port;

    @Override
    protected boolean spawnProcess()
    {
        return false;
    }

    protected void customizeCommandLine( Commandline cmd )
    {
        cmd.createArg().setValue( "--shutdown" );
        cmd.createArg().setValue( "--port=" + port );
    }

    protected String getExecutable()
    {
        return jscoverageServer;
    }
}
