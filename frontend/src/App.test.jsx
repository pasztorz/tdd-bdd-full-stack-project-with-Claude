import { describe, it, expect } from 'vitest'
import { render, screen } from '@testing-library/react'
import userEvent from '@testing-library/user-event'
import App from './App'

describe('App', () => {
  it('renders the Home section by default', () => {
    render(<App />)

    expect(screen.getByRole('heading', { name: /carpenter business name/i })).toBeInTheDocument()
  })

  it('switches to the About/Services section when its nav item is clicked', async () => {
    const user = userEvent.setup()
    render(<App />)

    await user.click(screen.getByRole('button', { name: /about\/services/i }))

    expect(screen.getByRole('heading', { name: /about\/services/i })).toBeInTheDocument()
    expect(screen.queryByRole('heading', { name: /carpenter business name/i })).not.toBeInTheDocument()
  })

  it('reaches the Custom Order Request section from within Contact', async () => {
    const user = userEvent.setup()
    render(<App />)

    await user.click(screen.getByRole('button', { name: /^contact$/i }))
    expect(screen.getByRole('heading', { name: /^contact$/i })).toBeInTheDocument()

    await user.click(screen.getByRole('button', { name: /start a custom order request/i }))
    expect(screen.getByRole('heading', { name: /custom order request/i })).toBeInTheDocument()
  })
})
