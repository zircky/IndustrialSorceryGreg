# Contributing

## YouTrack Workflow

Tasks move through the following stages:

Backlog → To Do → In Progress → Code Review → Testing → Done

## Branch Naming

Branches must contain the YouTrack issue ID.

Examples:

feature/ISGCore-10-polymerization-reactor
bugfix/ISGCore-11-wireless-energy-hatch
refactor/ISGCore-12-machine-registration
chore/ISGCore-13-update-gradle

## Commit Naming

Format:

ISGCore-<id> <description>

Examples:

ISGCore-10 Add polymerization reactor controller
ISGCore-11 Fix wireless energy transfer
ISGCore-12 Refactor machine registration

## Pull Requests

Each task should normally have its own branch and Pull Request.

Pull Request title format:

ISGCore-<id> <description>

Before merging:

- Project builds successfully
- Changes were tested
- Acceptance Criteria are satisfied
- No unrelated changes are included