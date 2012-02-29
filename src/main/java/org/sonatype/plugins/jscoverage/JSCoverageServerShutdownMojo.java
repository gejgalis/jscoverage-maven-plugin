package org.sonatype.plugins.jscoverage;

import org.codehaus.plexus.util.cli.Commandline;

/**
 * @goal stop-jscoverage
 * @phase post-integration-test
 */
public class JSCoverageServerShutdownMojo
    extends AbstractJSCoverageMojo
{

    @Override
    protected boolean spawnProcess()
    {
        return false;
    }

    protected void customizeCommandLine( Commandline cmd )
    {
        cmd.createArg().setValue( "--shutdown" );
    }

    protected String getExecutable()
    {
        return jscoverageServer;
    }
}
