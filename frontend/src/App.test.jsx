import { describe, it, expect } from 'vitest'
import { render, screen } from '@testing-library/react'
import App from './App'

describe('App', () => {
  it('renders the Home section by default', () => {
    render(<App />)

    expect(screen.getByRole('heading', { name: /carpenter business name/i })).toBeInTheDocument()
  })
})
